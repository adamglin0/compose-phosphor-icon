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

public val ThinGroup.Phosphorlogo: ImageVector
    get() {
        if (_phosphorlogo != null) {
            return _phosphorlogo!!
        }
        _phosphorlogo = Builder(name = "Phosphorlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 36.0f)
                lineTo(72.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(68.0f, 168.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, false, 76.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(148.0f, 172.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 0.0f, -136.0f)
                close()
                moveTo(76.0f, 55.27f)
                lineTo(137.16f, 164.0f)
                lineTo(76.0f, 164.0f)
                close()
                moveTo(140.0f, 152.73f)
                lineTo(78.84f, 44.0f)
                lineTo(140.0f, 44.0f)
                close()
                moveTo(76.13f, 172.0f)
                lineTo(140.0f, 172.0f)
                verticalLineToRelative(63.88f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 76.13f, 172.0f)
                close()
                moveTo(152.0f, 164.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(148.0f, 44.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 0.0f, 120.0f)
                close()
            }
        }
        .build()
        return _phosphorlogo!!
    }

private var _phosphorlogo: ImageVector? = null
