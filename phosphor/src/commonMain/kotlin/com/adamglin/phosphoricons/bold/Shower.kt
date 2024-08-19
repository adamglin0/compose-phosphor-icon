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

public val BoldGroup.Shower: ImageVector
    get() {
        if (_shower != null) {
            return _shower!!
        }
        _shower = Builder(name = "Shower", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(68.0f, 236.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 68.0f, 236.0f)
                close()
                moveTo(84.0f, 188.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 84.0f, 188.0f)
                close()
                moveTo(20.0f, 188.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 20.0f, 188.0f)
                close()
                moveTo(52.0f, 188.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 52.0f, 188.0f)
                close()
                moveTo(256.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(221.0f, 52.0f)
                lineTo(195.19f, 77.79f)
                lineTo(173.74f, 203.33f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -33.86f, 10.8f)
                lineToRelative(-98.0f, -98.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 52.72f, 82.25f)
                lineToRelative(125.5f, -21.44f)
                lineToRelative(29.29f, -29.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 216.0f, 28.0f)
                horizontalLineToRelative(28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 256.0f, 40.0f)
                close()
                moveTo(169.32f, 86.68f)
                lineToRelative(-105.0f, 17.94f)
                lineToRelative(87.07f, 87.07f)
                close()
            }
        }
        .build()
        return _shower!!
    }

private var _shower: ImageVector? = null
