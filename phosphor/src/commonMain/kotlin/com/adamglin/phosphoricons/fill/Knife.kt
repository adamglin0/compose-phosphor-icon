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

public val FillGroup.Knife: ImageVector
    get() {
        if (_knife != null) {
            return _knife!!
        }
        _knife = Builder(name = "Knife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 49.0f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, false, -42.63f, -17.66f)
                lineTo(143.16f, 81.54f)
                lineTo(18.34f, 206.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.86f, 13.45f)
                arcTo(160.67f, 160.67f, 0.0f, false, false, 58.4f, 224.0f)
                curveToRelative(32.95f, 0.0f, 65.91f, -10.2f, 96.94f, -30.23f)
                curveToRelative(31.76f, -20.5f, 50.19f, -43.82f, 51.0f, -44.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.64f, -10.59f)
                lineTo(181.31f, 114.0f)
                lineToRelative(47.38f, -47.39f)
                arcTo(24.84f, 24.84f, 0.0f, false, false, 236.0f, 49.0f)
                close()
                moveTo(146.23f, 180.6f)
                curveToRelative(-34.43f, 22.1f, -69.94f, 30.92f, -105.76f, 26.3f)
                lineTo(146.0f, 101.34f)
                lineToRelative(43.09f, 43.1f)
                arcTo(220.09f, 220.09f, 0.0f, false, true, 146.23f, 180.6f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null
