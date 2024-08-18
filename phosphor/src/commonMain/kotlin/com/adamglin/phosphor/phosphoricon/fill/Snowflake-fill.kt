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

public val FillGroup.`Snowflake-fill`: ImageVector
    get() {
        if (`_snowflake-fill` != null) {
            return `_snowflake-fill`!!
        }
        `_snowflake-fill` = Builder(name = "Snowflake-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(170.37f, 143.22f)
                lineTo(189.31f, 136.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 5.38f, 15.08f)
                lineToRelative(-15.48f, 5.52f)
                lineToRelative(4.52f, 16.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, 9.8f)
                arcTo(8.23f, 8.23f, 0.0f, false, true, 176.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.73f, -5.93f)
                lineToRelative(-5.57f, -20.8f)
                lineTo(136.0f, 141.86f)
                verticalLineToRelative(30.83f)
                lineToRelative(13.66f, 13.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(128.0f, 187.31f)
                lineToRelative(-10.34f, 10.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(120.0f, 172.69f)
                lineTo(120.0f, 141.86f)
                lineTo(93.3f, 157.27f)
                lineToRelative(-5.57f, 20.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 184.0f)
                arcToRelative(8.23f, 8.23f, 0.0f, false, true, -2.07f, -0.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -9.8f)
                lineToRelative(4.52f, -16.87f)
                lineToRelative(-15.48f, -5.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.38f, -15.08f)
                lineToRelative(18.94f, 6.76f)
                lineTo(112.0f, 128.0f)
                lineTo(85.63f, 112.78f)
                lineToRelative(-18.94f, 6.76f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 64.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.69f, -15.54f)
                lineToRelative(15.48f, -5.52f)
                lineTo(72.27f, 82.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.46f, -4.14f)
                lineToRelative(5.57f, 20.8f)
                lineTo(120.0f, 114.14f)
                lineTo(120.0f, 83.31f)
                lineTo(106.34f, 69.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(128.0f, 68.69f)
                lineToRelative(10.34f, -10.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(136.0f, 83.31f)
                verticalLineToRelative(30.83f)
                lineToRelative(26.7f, -15.41f)
                lineToRelative(5.57f, -20.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.46f, 4.14f)
                lineToRelative(-4.52f, 16.87f)
                lineToRelative(15.48f, 5.52f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 120.0f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, -2.69f, -0.46f)
                lineToRelative(-18.94f, -6.76f)
                lineTo(144.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_snowflake-fill`!!
    }

private var `_snowflake-fill`: ImageVector? = null
