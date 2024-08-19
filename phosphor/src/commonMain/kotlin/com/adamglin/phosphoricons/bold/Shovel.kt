package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Shovel: ImageVector
    get() {
        if (_shovel != null) {
            return _shovel!!
        }
        _shovel = Builder(name = "Shovel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.49f, 55.51f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(199.0f, 40.0f)
                lineToRelative(-65.37f, 65.37f)
                lineTo(102.14f, 73.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineToRelative(-56.0f, 56.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 12.0f, 144.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 14.14f, -5.86f)
                lineToRelative(56.0f, -56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -28.28f)
                lineToRelative(-31.51f, -31.52f)
                lineTo(216.0f, 57.0f)
                lineToRelative(15.51f, 15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, -17.0f)
                close()
                moveTo(162.34f, 168.0f)
                lineToRelative(-52.0f, 52.0f)
                horizontalLineTo(36.0f)
                verticalLineTo(145.66f)
                lineToRelative(52.0f, -52.0f)
                lineToRelative(28.69f, 28.68f)
                lineTo(79.51f, 159.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(37.17f, -37.18f)
                close()
            }
        }
        .build()
        return _shovel!!
    }

private var _shovel: ImageVector? = null
