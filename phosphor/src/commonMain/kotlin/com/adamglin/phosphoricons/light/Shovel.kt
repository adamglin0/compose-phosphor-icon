package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Shovel: ImageVector
    get() {
        if (_shovel != null) {
            return _shovel!!
        }
        _shovel = Builder(name = "Shovel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.24f, 59.76f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(207.52f, 40.0f)
                lineToRelative(-73.86f, 73.86f)
                lineTo(97.9f, 78.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineToRelative(-56.0f, 56.0f)
                arcTo(13.94f, 13.94f, 0.0f, false, false, 18.0f, 144.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, -4.1f)
                lineToRelative(56.0f, -56.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.8f)
                lineToRelative(-35.76f, -35.76f)
                lineTo(216.0f, 48.48f)
                lineToRelative(19.76f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, -8.48f)
                close()
                moveTo(169.41f, 166.58f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.84f)
                lineToRelative(-56.0f, 56.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 112.0f, 226.0f)
                horizontalLineTo(32.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(144.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.58f, -1.42f)
                lineToRelative(56.0f, -56.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 88.0f, 86.0f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, 1.42f, 0.58f)
                lineToRelative(35.75f, 35.76f)
                lineTo(83.76f, 163.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(41.42f, -41.41f)
                close()
            }
        }
        .build()
        return _shovel!!
    }

private var _shovel: ImageVector? = null
