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

public val FillGroup.TrainSimple: ImageVector
    get() {
        if (_trainSimple != null) {
            return _trainSimple!!
        }
        _trainSimple = Builder(name = "TrainSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 24.0f)
                lineTo(72.0f, 24.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 40.0f, 56.0f)
                lineTo(40.0f, 184.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(8.0f)
                lineTo(65.6f, 235.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.8f, 9.6f)
                lineTo(100.0f, 216.0f)
                horizontalLineToRelative(56.0f)
                lineToRelative(21.6f, 28.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.8f, -9.6f)
                lineTo(176.0f, 216.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(216.0f, 56.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 184.0f, 24.0f)
                close()
                moveTo(184.0f, 200.0f)
                lineTo(72.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(56.0f, 136.0f)
                lineTo(200.0f, 136.0f)
                verticalLineToRelative(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 184.0f, 200.0f)
                close()
                moveTo(96.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 172.0f)
                close()
                moveTo(184.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 184.0f, 172.0f)
                close()
            }
        }
        .build()
        return _trainSimple!!
    }

private var _trainSimple: ImageVector? = null
