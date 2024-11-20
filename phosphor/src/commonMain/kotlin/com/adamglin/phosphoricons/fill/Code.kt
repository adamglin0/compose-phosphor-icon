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

public val FillGroup.Code: ImageVector
    get() {
        if (_code != null) {
            return _code!!
        }
        _code = Builder(name = "Code", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(92.8f, 145.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -9.6f, 12.8f)
                lineToRelative(-32.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -12.8f)
                lineToRelative(32.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.6f, 12.8f)
                lineTo(69.33f, 128.0f)
                close()
                moveTo(151.69f, 74.2f)
                lineTo(119.69f, 186.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.38f, -4.4f)
                lineToRelative(32.0f, -112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.38f, 4.4f)
                close()
                moveTo(204.8f, 134.4f)
                lineTo(172.8f, 158.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.6f, -12.8f)
                lineTo(186.67f, 128.0f)
                lineTo(163.2f, 110.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 9.6f, -12.8f)
                lineToRelative(32.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 12.8f)
                close()
            }
        }
        .build()
        return _code!!
    }

private var _code: ImageVector? = null
