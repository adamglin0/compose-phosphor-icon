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

public val ThinGroup.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) {
            return _globeSimple!!
        }
        _globeSimple = Builder(name = "GlobeSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                horizontalLineToRelative(0.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(219.9f, 124.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-1.15f, -45.55f, -21.74f, -74.52f, -33.48f, -87.4f)
                arcTo(92.14f, 92.14f, 0.0f, false, true, 219.91f, 124.0f)
                close()
                moveTo(128.0f, 218.61f)
                curveToRelative(-8.32f, -8.0f, -34.57f, -37.13f, -35.93f, -86.61f)
                horizontalLineToRelative(71.86f)
                curveTo(162.57f, 181.48f, 136.32f, 210.61f, 128.0f, 218.61f)
                close()
                moveTo(92.07f, 124.0f)
                curveTo(93.43f, 74.52f, 119.68f, 45.39f, 128.0f, 37.39f)
                curveToRelative(8.32f, 8.0f, 34.57f, 37.13f, 35.93f, 86.61f)
                close()
                moveTo(117.54f, 36.6f)
                curveTo(105.8f, 49.48f, 85.21f, 78.45f, 84.06f, 124.0f)
                horizontalLineToRelative(-48.0f)
                arcTo(92.14f, 92.14f, 0.0f, false, true, 117.54f, 36.6f)
                close()
                moveTo(36.09f, 132.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(1.15f, 45.55f, 21.74f, 74.52f, 33.48f, 87.4f)
                arcTo(92.14f, 92.14f, 0.0f, false, true, 36.09f, 132.0f)
                close()
                moveTo(138.46f, 219.4f)
                curveToRelative(11.74f, -12.88f, 32.33f, -41.85f, 33.48f, -87.4f)
                horizontalLineToRelative(48.0f)
                arcTo(92.14f, 92.14f, 0.0f, false, true, 138.46f, 219.4f)
                close()
            }
        }
        .build()
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
