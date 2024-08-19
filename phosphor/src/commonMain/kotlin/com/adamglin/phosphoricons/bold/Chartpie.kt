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

public val BoldGroup.Chartpie: ImageVector
    get() {
        if (_chartpie != null) {
            return _chartpie!!
        }
        _chartpie = Builder(name = "Chartpie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(140.0f, 44.87f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 194.0f, 76.07f)
                lineTo(140.0f, 107.22f)
                close()
                moveTo(50.0f, 159.17f)
                arcToRelative(83.94f, 83.94f, 0.0f, false, true, 66.0f, -114.3f)
                verticalLineToRelative(76.2f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(83.88f, 83.88f, 0.0f, false, true, -65.95f, -32.07f)
                lineTo(206.0f, 96.83f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _chartpie!!
    }

private var _chartpie: ImageVector? = null
