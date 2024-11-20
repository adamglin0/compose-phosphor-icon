package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) {
            return _penNibStraight!!
        }
        _penNibStraight = Builder(name = "PenNibStraight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.75f, 125.66f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, false, -0.1f, -0.19f)
                lineTo(188.0f, 70.94f)
                lineTo(188.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(80.0f, 20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 32.0f)
                lineTo(68.0f, 71.0f)
                lineTo(37.34f, 125.47f)
                lineToRelative(-0.1f, 0.19f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.15f, 12.5f)
                lineToRelative(86.44f, 112.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.34f, 0.0f)
                lineToRelative(86.49f, -112.35f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 218.75f, 125.66f)
                close()
                moveTo(80.0f, 28.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(180.0f, 68.0f)
                lineTo(76.0f, 68.0f)
                lineTo(76.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 80.0f, 28.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 148.0f)
                close()
                moveTo(211.27f, 133.28f)
                lineTo(132.0f, 236.25f)
                lineTo(132.0f, 155.66f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -8.0f, 0.0f)
                verticalLineToRelative(80.58f)
                lineTo(44.78f, 133.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.4f, -4.06f)
                lineTo(74.35f, 76.0f)
                lineTo(181.66f, 76.0f)
                lineToRelative(30.0f, 53.28f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 211.27f, 133.28f)
                close()
            }
        }
        .build()
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
