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

public val LightGroup.ChartPolar: ImageVector
    get() {
        if (_chartPolar != null) {
            return _chartPolar!!
        }
        _chartPolar = Builder(name = "ChartPolar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(217.8f, 122.0f)
                lineTo(189.7f, 122.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, false, 134.0f, 66.3f)
                lineTo(134.0f, 38.2f)
                arcTo(90.15f, 90.15f, 0.0f, false, true, 217.8f, 122.0f)
                close()
                moveTo(122.0f, 122.0f)
                lineTo(78.37f, 122.0f)
                arcTo(50.09f, 50.09f, 0.0f, false, true, 122.0f, 78.37f)
                close()
                moveTo(122.0f, 134.0f)
                verticalLineToRelative(43.63f)
                arcTo(50.09f, 50.09f, 0.0f, false, true, 78.37f, 134.0f)
                close()
                moveTo(134.0f, 134.0f)
                horizontalLineToRelative(43.63f)
                arcTo(50.09f, 50.09f, 0.0f, false, true, 134.0f, 177.63f)
                close()
                moveTo(134.0f, 122.0f)
                lineTo(134.0f, 78.37f)
                arcTo(50.09f, 50.09f, 0.0f, false, true, 177.63f, 122.0f)
                close()
                moveTo(122.0f, 38.2f)
                lineTo(122.0f, 66.3f)
                arcTo(62.07f, 62.07f, 0.0f, false, false, 66.3f, 122.0f)
                lineTo(38.2f, 122.0f)
                arcTo(90.15f, 90.15f, 0.0f, false, true, 122.0f, 38.2f)
                close()
                moveTo(38.2f, 134.0f)
                lineTo(66.3f, 134.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, false, 122.0f, 189.7f)
                verticalLineToRelative(28.1f)
                arcTo(90.15f, 90.15f, 0.0f, false, true, 38.2f, 134.0f)
                close()
                moveTo(134.0f, 217.8f)
                lineTo(134.0f, 189.7f)
                arcTo(62.07f, 62.07f, 0.0f, false, false, 189.7f, 134.0f)
                horizontalLineToRelative(28.1f)
                arcTo(90.15f, 90.15f, 0.0f, false, true, 134.0f, 217.8f)
                close()
            }
        }
        .build()
        return _chartPolar!!
    }

private var _chartPolar: ImageVector? = null
