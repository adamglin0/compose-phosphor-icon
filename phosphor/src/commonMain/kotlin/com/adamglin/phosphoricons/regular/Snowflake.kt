package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.77f, 150.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.86f, 9.68f)
                lineToRelative(-24.64f, 6.0f)
                lineToRelative(6.46f, 24.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, 9.8f)
                arcTo(8.25f, 8.25f, 0.0f, false, true, 192.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.72f, -5.93f)
                lineToRelative(-7.72f, -28.8f)
                lineTo(136.0f, 141.86f)
                verticalLineToRelative(46.83f)
                lineToRelative(21.66f, 21.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(128.0f, 203.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(120.0f, 188.69f)
                verticalLineTo(141.86f)
                lineTo(79.45f, 165.27f)
                lineToRelative(-7.72f, 28.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 64.0f, 200.0f)
                arcToRelative(8.25f, 8.25f, 0.0f, false, true, -2.08f, -0.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -9.8f)
                lineToRelative(6.46f, -24.11f)
                lineToRelative(-24.64f, -6.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.82f, -15.54f)
                lineToRelative(29.45f, 7.23f)
                lineTo(112.0f, 128.0f)
                lineTo(71.36f, 104.54f)
                lineToRelative(-29.45f, 7.23f)
                arcTo(7.85f, 7.85f, 0.0f, false, true, 40.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.91f, -15.77f)
                lineToRelative(24.64f, -6.0f)
                lineTo(56.27f, 66.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.46f, -4.14f)
                lineToRelative(7.72f, 28.8f)
                lineTo(120.0f, 114.14f)
                verticalLineTo(67.31f)
                lineTo(98.34f, 45.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(128.0f, 52.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(136.0f, 67.31f)
                verticalLineToRelative(46.83f)
                lineToRelative(40.55f, -23.41f)
                lineToRelative(7.72f, -28.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.46f, 4.14f)
                lineToRelative(-6.46f, 24.11f)
                lineToRelative(24.64f, 6.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 112.0f)
                arcToRelative(7.85f, 7.85f, 0.0f, false, true, -1.91f, -0.23f)
                lineToRelative(-29.45f, -7.23f)
                lineTo(144.0f, 128.0f)
                lineToRelative(40.64f, 23.46f)
                lineToRelative(29.45f, -7.23f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 223.77f, 150.09f)
                close()
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
