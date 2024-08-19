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

public val FillGroup.Prescription: ImageVector
    get() {
        if (_prescription != null) {
            return _prescription!!
        }
        _prescription = Builder(name = "Prescription", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 120.0f)
                lineTo(96.0f, 120.0f)
                lineTo(96.0f, 72.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f)
                close()
                moveTo(224.0f, 48.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                lineTo(208.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(189.66f, 186.34f)
                lineTo(175.31f, 172.0f)
                lineToRelative(14.35f, -14.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(164.0f, 160.69f)
                lineToRelative(-26.0f, -26.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 128.0f, 56.0f)
                lineTo(88.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(80.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(96.0f, 136.0f)
                horizontalLineToRelative(20.69f)
                lineToRelative(36.0f, 36.0f)
                lineToRelative(-14.35f, 14.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(164.0f, 183.31f)
                lineToRelative(14.34f, 14.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
            }
        }
        .build()
        return _prescription!!
    }

private var _prescription: ImageVector? = null
