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

public val ThinGroup.Shapes: ImageVector
    get() {
        if (_shapes != null) {
            return _shapes!!
        }
        _shapes = Builder(name = "Shapes", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(67.79f, 62.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.58f, 0.0f)
                lineToRelative(-40.0f, 120.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 188.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.79f, -5.26f)
                close()
                moveTo(29.55f, 180.0f)
                lineTo(64.0f, 76.65f)
                lineTo(98.45f, 180.0f)
                close()
                moveTo(204.0f, 76.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -48.0f, 48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 204.0f, 76.0f)
                close()
                moveTo(116.0f, 76.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 116.0f, 76.0f)
                close()
                moveTo(224.0f, 148.0f)
                lineTo(136.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(228.0f, 152.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 148.0f)
                close()
                moveTo(220.0f, 204.0f)
                lineTo(140.0f, 204.0f)
                lineTo(140.0f, 156.0f)
                horizontalLineToRelative(80.0f)
                close()
            }
        }
        .build()
        return _shapes!!
    }

private var _shapes: ImageVector? = null
