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

public val LightGroup.MapTrifold: ImageVector
    get() {
        if (_mapTrifold != null) {
            return _mapTrifold!!
        }
        _mapTrifold = Builder(name = "MapTrifold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.69f, 51.27f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.15f, -1.09f)
                lineTo(160.7f, 65.64f)
                lineToRelative(-62.0f, -31.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.14f, -0.45f)
                lineToRelative(-64.0f, 16.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.46f, 5.82f)
                lineTo(95.3f, 190.36f)
                lineToRelative(62.0f, 31.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.14f, 0.45f)
                lineToRelative(64.0f, -16.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 230.0f, 200.0f)
                lineTo(230.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 227.69f, 51.27f)
                close()
                moveTo(102.0f, 49.71f)
                lineToRelative(52.0f, 26.0f)
                lineTo(154.0f, 206.29f)
                lineToRelative(-52.0f, -26.0f)
                close()
                moveTo(38.0f, 60.71f)
                lineTo(90.0f, 47.71f)
                lineTo(90.0f, 179.32f)
                lineToRelative(-52.0f, 13.0f)
                close()
                moveTo(218.0f, 195.32f)
                lineToRelative(-52.0f, 13.0f)
                lineTo(166.0f, 76.68f)
                lineToRelative(52.0f, -13.0f)
                close()
            }
        }
        .build()
        return _mapTrifold!!
    }

private var _mapTrifold: ImageVector? = null
