package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Pushpin: ImageVector
    get() {
        if (_pushpin != null) {
            return _pushpin!!
        }
        _pushpin = Builder(name = "Pushpin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.33f, 104.0f)
                lineToRelative(-53.47f, 53.65f)
                curveToRelative(4.56f, 12.67f, 6.45f, 33.89f, -13.19f, 60.0f)
                arcTo(15.93f, 15.93f, 0.0f, false, true, 157.0f, 224.0f)
                curveToRelative(-0.38f, 0.0f, -0.75f, 0.0f, -1.13f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.32f, -4.69f)
                lineTo(96.29f, 171.0f)
                lineTo(53.66f, 213.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(85.0f, 159.71f)
                lineToRelative(-48.3f, -48.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 38.0f, 87.63f)
                curveToRelative(25.42f, -20.51f, 49.75f, -16.48f, 60.4f, -13.14f)
                lineTo(152.0f, 20.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 0.0f)
                lineToRelative(60.69f, 60.68f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 235.33f, 104.0f)
                close()
            }
        }
        .build()
        return _pushpin!!
    }

private var _pushpin: ImageVector? = null
