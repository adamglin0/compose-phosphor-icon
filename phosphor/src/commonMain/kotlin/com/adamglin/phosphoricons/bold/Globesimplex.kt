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

public val BoldGroup.GlobeSimpleX: ImageVector
    get() {
        if (_globeSimpleX != null) {
            return _globeSimpleX!!
        }
        _globeSimpleX = Builder(name = "GlobeSimpleX", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.49f, 176.49f)
                lineTo(209.0f, 192.0f)
                lineToRelative(15.52f, 15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(192.0f, 209.0f)
                lineToRelative(-15.51f, 15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(175.0f, 192.0f)
                lineToRelative(-15.52f, -15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(192.0f, 175.0f)
                lineToRelative(15.51f, -15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
                moveTo(236.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(100.54f, 140.0f)
                curveToRelative(4.37f, 49.56f, 34.63f, 74.37f, 35.0f, 74.63f)
                horizontalLineToRelative(0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 236.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 236.0f, 128.0f)
                close()
                moveTo(158.21f, 49.64f)
                arcTo(144.3f, 144.3f, 0.0f, false, true, 179.56f, 116.0f)
                horizontalLineToRelative(31.57f)
                arcTo(84.22f, 84.22f, 0.0f, false, false, 158.21f, 49.64f)
                close()
                moveTo(117.64f, 63.23f)
                arcTo(119.74f, 119.74f, 0.0f, false, false, 100.53f, 116.0f)
                horizontalLineToRelative(54.94f)
                curveToRelative(-3.0f, -33.9f, -18.09f, -56.22f, -27.45f, -67.0f)
                arcTo(107.75f, 107.75f, 0.0f, false, false, 117.64f, 63.23f)
                close()
                moveTo(44.87f, 116.0f)
                lineTo(76.44f, 116.0f)
                arcTo(144.3f, 144.3f, 0.0f, false, true, 97.79f, 49.64f)
                arcTo(84.22f, 84.22f, 0.0f, false, false, 44.87f, 116.0f)
                close()
                moveTo(76.44f, 140.0f)
                lineTo(44.87f, 140.0f)
                arcToRelative(84.22f, 84.22f, 0.0f, false, false, 52.92f, 66.36f)
                arcTo(144.3f, 144.3f, 0.0f, false, true, 76.44f, 140.0f)
                close()
            }
        }
        .build()
        return _globeSimpleX!!
    }

private var _globeSimpleX: ImageVector? = null
