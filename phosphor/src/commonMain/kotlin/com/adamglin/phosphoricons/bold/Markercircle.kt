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

public val BoldGroup.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) {
            return _markerCircle!!
        }
        _markerCircle = Builder(name = "MarkerCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.37f, 51.6f)
                arcTo(108.08f, 108.08f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.09f, 108.09f, 0.0f, false, false, 204.37f, 51.6f)
                close()
                moveTo(108.0f, 140.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(16.0f)
                lineTo(108.0f, 156.0f)
                close()
                moveTo(92.0f, 203.92f)
                lineTo(92.0f, 180.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(23.9f)
                arcTo(84.33f, 84.33f, 0.0f, false, true, 92.0f, 203.92f)
                close()
                moveTo(188.0f, 186.79f)
                lineTo(188.0f, 176.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -16.0f, -19.6f)
                lineTo(172.0f, 136.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -14.85f, -19.31f)
                lineTo(147.27f, 81.2f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -38.54f, 0.0f)
                lineToRelative(-9.88f, 35.49f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 84.0f, 136.0f)
                verticalLineToRelative(20.42f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 68.0f, 176.0f)
                verticalLineToRelative(10.77f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 120.0f, 0.0f)
                close()
            }
        }
        .build()
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
