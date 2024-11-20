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

public val ThinGroup.GlobeSimpleX: ImageVector
    get() {
        if (_globeSimpleX != null) {
            return _globeSimpleX!!
        }
        _globeSimpleX = Builder(name = "GlobeSimpleX", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.83f, 170.83f)
                lineTo(197.66f, 192.0f)
                lineToRelative(21.17f, 21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineTo(192.0f, 197.66f)
                lineToRelative(-21.17f, 21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineTo(186.34f, 192.0f)
                lineToRelative(-21.17f, -21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(192.0f, 186.34f)
                lineToRelative(21.17f, -21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f)
                close()
                moveTo(228.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(92.08f, 132.0f)
                curveToRelative(1.61f, 58.53f, 38.05f, 88.58f, 38.42f, 88.88f)
                horizontalLineToRelative(0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 128.0f, 228.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, true, 0.0f, -200.0f)
                horizontalLineToRelative(0.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, true, 228.0f, 128.0f)
                close()
                moveTo(138.46f, 36.6f)
                curveToRelative(11.74f, 12.88f, 32.33f, 41.85f, 33.48f, 87.4f)
                horizontalLineToRelative(48.0f)
                arcTo(92.14f, 92.14f, 0.0f, false, false, 138.46f, 36.6f)
                close()
                moveTo(92.07f, 124.0f)
                horizontalLineToRelative(71.86f)
                curveTo(162.57f, 74.52f, 136.32f, 45.4f, 128.0f, 37.39f)
                curveTo(119.68f, 45.39f, 93.43f, 74.52f, 92.07f, 124.0f)
                close()
                moveTo(36.07f, 124.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(1.15f, -45.55f, 21.74f, -74.52f, 33.48f, -87.4f)
                arcTo(92.14f, 92.14f, 0.0f, false, false, 36.09f, 124.0f)
                close()
                moveTo(84.07f, 132.0f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(92.14f, 92.14f, 0.0f, false, false, 81.45f, 87.4f)
                curveTo(105.8f, 206.52f, 85.21f, 177.55f, 84.06f, 132.0f)
                close()
            }
        }
        .build()
        return _globeSimpleX!!
    }

private var _globeSimpleX: ImageVector? = null
