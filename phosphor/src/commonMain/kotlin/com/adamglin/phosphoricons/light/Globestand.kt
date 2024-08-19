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

public val LightGroup.Globestand: ImageVector
    get() {
        if (_globestand != null) {
            return _globestand!!
        }
        _globestand = Builder(name = "Globestand", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 182.0f)
                arcToRelative(78.0f, 78.0f, 0.0f, true, false, -78.0f, -78.0f)
                arcTo(78.09f, 78.09f, 0.0f, false, false, 136.0f, 182.0f)
                close()
                moveTo(136.0f, 38.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, true, -66.0f, 66.0f)
                arcTo(66.08f, 66.08f, 0.0f, false, true, 136.0f, 38.0f)
                close()
                moveTo(212.33f, 174.89f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.17f, 8.48f)
                arcTo(109.21f, 109.21f, 0.0f, false, true, 142.0f, 213.83f)
                lineTo(142.0f, 234.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(104.0f, 246.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(26.0f)
                lineTo(130.0f, 213.83f)
                arcToRelative(110.0f, 110.0f, 0.0f, false, true, -73.38f, -186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.66f, 8.32f)
                arcTo(98.0f, 98.0f, 0.0f, false, false, 203.84f, 174.72f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 212.33f, 174.89f)
                close()
            }
        }
        .build()
        return _globestand!!
    }

private var _globestand: ImageVector? = null
