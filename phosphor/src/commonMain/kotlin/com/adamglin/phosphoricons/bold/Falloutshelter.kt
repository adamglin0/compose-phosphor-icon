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

public val BoldGroup.Falloutshelter: ImageVector
    get() {
        if (_falloutshelter != null) {
            return _falloutshelter!!
        }
        _falloutshelter = Builder(name = "Falloutshelter", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(194.0f, 138.66f)
                lineTo(170.0f, 174.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.0f, 0.0f)
                lineToRelative(-22.0f, -33.0f)
                lineToRelative(-22.0f, 33.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.0f, 0.0f)
                lineToRelative(-24.0f, -36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 120.0f)
                horizontalLineToRelative(41.58f)
                lineTo(94.0f, 90.66f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 72.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.0f, 18.66f)
                lineTo(142.42f, 120.0f)
                lineTo(184.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.0f, 18.66f)
                close()
            }
        }
        .build()
        return _falloutshelter!!
    }

private var _falloutshelter: ImageVector? = null
