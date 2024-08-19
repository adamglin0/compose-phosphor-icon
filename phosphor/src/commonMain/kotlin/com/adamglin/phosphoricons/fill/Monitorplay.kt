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

public val FillGroup.Monitorplay: ImageVector
    get() {
        if (_monitorplay != null) {
            return _monitorplay!!
        }
        _monitorplay = Builder(name = "Monitorplay", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 224.0f)
                close()
                moveTo(232.0f, 64.0f)
                lineTo(232.0f, 176.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(48.0f, 200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                lineTo(24.0f, 64.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 48.0f, 40.0f)
                lineTo(208.0f, 40.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 232.0f, 64.0f)
                close()
                moveTo(164.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.41f, -6.55f)
                lineToRelative(-40.0f, -28.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 108.0f, 92.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.59f, 6.55f)
                lineToRelative(40.0f, -28.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 164.0f, 120.0f)
                close()
            }
        }
        .build()
        return _monitorplay!!
    }

private var _monitorplay: ImageVector? = null
