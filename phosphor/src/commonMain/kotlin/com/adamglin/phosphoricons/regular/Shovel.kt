package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Shovel: ImageVector
    get() {
        if (_shovel != null) {
            return _shovel!!
        }
        _shovel = Builder(name = "Shovel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.66f, 58.34f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(204.69f, 40.0f)
                lineToRelative(-71.0f, 71.0f)
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
                lineToRelative(71.0f, -71.0f)
                lineToRelative(18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
                moveTo(168.0f, 168.0f)
                lineToRelative(-56.0f, 56.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(144.0f)
                lineTo(88.0f, 88.0f)
                lineToRelative(34.34f, 34.34f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(40.0f, -40.0f)
                close()
            }
        }
        .build()
        return _shovel!!
    }

private var _shovel: ImageVector? = null
