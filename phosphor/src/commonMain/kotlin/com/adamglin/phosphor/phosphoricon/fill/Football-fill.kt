package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Football-fill`: ImageVector
    get() {
        if (`_football-fill` != null) {
            return `_football-fill`!!
        }
        `_football-fill` = Builder(name = "Football-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.06f, 53.89f)
                arcToRelative(32.92f, 32.92f, 0.0f, false, false, -26.95f, -26.95f)
                curveToRelative(-32.38f, -5.49f, -93.39f, -8.0f, -138.27f, 36.9f)
                reflectiveCurveToRelative(-42.39f, 105.9f, -36.9f, 138.27f)
                arcToRelative(32.92f, 32.92f, 0.0f, false, false, 27.0f, 26.95f)
                arcTo(206.58f, 206.58f, 0.0f, false, false, 88.27f, 232.0f)
                curveToRelative(32.09f, 0.0f, 72.05f, -8.0f, 103.89f, -39.84f)
                curveTo(237.05f, 147.28f, 234.55f, 86.26f, 229.06f, 53.89f)
                close()
                moveTo(56.56f, 213.3f)
                arcTo(16.94f, 16.94f, 0.0f, false, true, 42.7f, 199.44f)
                arcToRelative(180.27f, 180.27f, 0.0f, false, true, -2.11f, -46.9f)
                lineToRelative(62.87f, 62.87f)
                arcTo(180.27f, 180.27f, 0.0f, false, true, 56.56f, 213.3f)
                close()
                moveTo(165.64f, 101.67f)
                lineTo(151.3f, 116.0f)
                lineToRelative(6.34f, 6.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.31f, 11.3f)
                lineTo(140.0f, 127.31f)
                lineTo(127.31f, 140.0f)
                lineToRelative(6.34f, 6.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.3f, 11.31f)
                lineTo(116.0f, 151.3f)
                lineToRelative(-14.34f, 14.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.31f, -11.31f)
                lineTo(104.7f, 140.0f)
                lineToRelative(-6.34f, -6.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, -11.3f)
                lineToRelative(6.34f, 6.34f)
                lineTo(128.69f, 116.0f)
                lineToRelative(-6.34f, -6.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, -11.31f)
                lineTo(140.0f, 104.7f)
                lineToRelative(14.34f, -14.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.31f, 11.31f)
                close()
                moveTo(215.41f, 103.46f)
                lineTo(152.54f, 40.59f)
                curveToRelative(4.76f, -0.44f, 9.72f, -0.69f, 14.91f, -0.69f)
                arcToRelative(192.0f, 192.0f, 0.0f, false, true, 32.0f, 2.8f)
                arcTo(16.94f, 16.94f, 0.0f, false, true, 213.3f, 56.56f)
                arcTo(180.27f, 180.27f, 0.0f, false, true, 215.41f, 103.46f)
                close()
            }
        }
        .build()
        return `_football-fill`!!
    }

private var `_football-fill`: ImageVector? = null
