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

public val FillGroup.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) {
            return _cassetteTape!!
        }
        _cassetteTape = Builder(name = "CassetteTape", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.3f, 96.0f)
                arcToRelative(31.92f, 31.92f, 0.0f, false, false, 0.0f, 32.0f)
                lineTo(99.7f, 128.0f)
                arcToRelative(31.92f, 31.92f, 0.0f, false, false, 0.0f, -32.0f)
                close()
                moveTo(72.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 72.0f, 96.0f)
                close()
                moveTo(240.0f, 64.0f)
                lineTo(240.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 48.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 64.0f)
                close()
                moveTo(186.0f, 192.0f)
                lineToRelative(-15.6f, -20.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 164.0f, 168.0f)
                lineTo(92.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.4f, 3.2f)
                lineTo(70.0f, 192.0f)
                close()
                moveTo(216.0f, 112.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                lineTo(72.0f, 80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, 64.0f)
                lineTo(184.0f, 144.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 216.0f, 112.0f)
                close()
                moveTo(184.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 184.0f, 96.0f)
                close()
            }
        }
        .build()
        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null
