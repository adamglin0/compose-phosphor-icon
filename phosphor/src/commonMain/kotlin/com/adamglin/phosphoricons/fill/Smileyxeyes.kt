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

public val FillGroup.SmileyXEyes: ImageVector
    get() {
        if (_smileyXEyes != null) {
            return _smileyXEyes!!
        }
        _smileyXEyes = Builder(name = "SmileyXEyes", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.13f, 104.13f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(109.66f, 122.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(88.0f, 123.31f)
                lineTo(77.66f, 133.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(76.69f, 112.0f)
                lineTo(66.34f, 101.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 77.66f, 90.34f)
                lineTo(88.0f, 100.69f)
                lineTo(98.34f, 90.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(99.31f, 112.0f)
                close()
                moveTo(128.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 192.0f)
                close()
                moveTo(189.66f, 122.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(168.0f, 123.31f)
                lineToRelative(-10.34f, 10.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(156.69f, 112.0f)
                lineToRelative(-10.35f, -10.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(168.0f, 100.69f)
                lineToRelative(10.34f, -10.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(179.31f, 112.0f)
                close()
            }
        }
        .build()
        return _smileyXEyes!!
    }

private var _smileyXEyes: ImageVector? = null
