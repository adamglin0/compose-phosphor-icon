package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Twitter-logo-fill`: ImageVector
    get() {
        if (`_twitter-logo-fill` != null) {
            return `_twitter-logo-fill`!!
        }
        `_twitter-logo-fill` = Builder(name = "Twitter-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.66f, 77.66f)
                lineToRelative(-29.9f, 29.9f)
                curveTo(209.72f, 177.58f, 150.67f, 232.0f, 80.0f, 232.0f)
                curveToRelative(-14.52f, 0.0f, -26.49f, -2.3f, -35.58f, -6.84f)
                curveToRelative(-7.33f, -3.67f, -10.33f, -7.6f, -11.08f, -8.72f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.85f, -11.93f)
                curveToRelative(0.26f, -0.1f, 24.24f, -9.31f, 39.47f, -26.84f)
                arcToRelative(110.93f, 110.93f, 0.0f, false, true, -21.88f, -24.2f)
                curveToRelative(-12.4f, -18.41f, -26.28f, -50.39f, -22.0f, -98.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.65f, -4.92f)
                curveToRelative(0.35f, 0.35f, 33.28f, 33.1f, 73.54f, 43.72f)
                verticalLineTo(88.0f)
                arcToRelative(47.87f, 47.87f, 0.0f, false, true, 14.36f, -34.3f)
                arcTo(46.87f, 46.87f, 0.0f, false, true, 168.1f, 40.0f)
                arcToRelative(48.66f, 48.66f, 0.0f, false, true, 41.47f, 24.0f)
                horizontalLineTo(240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 13.66f)
                close()
            }
        }
        .build()
        return `_twitter-logo-fill`!!
    }

private var `_twitter-logo-fill`: ImageVector? = null
