package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Shovel: ImageVector
    get() {
        if (_shovel != null) {
            return _shovel!!
        }
        _shovel = Builder(name = "Shovel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.66f, 69.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineTo(216.0f, 51.31f)
                lineToRelative(-71.0f, 71.0f)
                lineTo(133.66f, 111.0f)
                lineToRelative(71.0f, -71.0f)
                lineTo(186.34f, 21.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(48.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 245.66f, 69.66f)
                close()
                moveTo(88.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -13.66f)
                lineTo(133.66f, 111.0f)
                lineTo(99.31f, 76.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f)
                lineToRelative(-56.0f, 56.0f)
                arcTo(15.89f, 15.89f, 0.0f, false, false, 16.0f, 144.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, false, 11.31f, -4.69f)
                lineToRelative(56.0f, -56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.62f)
                lineTo(145.0f, 122.34f)
                lineTo(93.66f, 173.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 176.0f)
                close()
            }
        }
        .build()
        return _shovel!!
    }

private var _shovel: ImageVector? = null
