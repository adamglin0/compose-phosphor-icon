package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Batteryplus: ImageVector
    get() {
        if (_batteryplus != null) {
            return _batteryplus!!
        }
        _batteryplus = Builder(name = "Batteryplus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(128.0f, 140.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(104.0f, 140.0f)
                lineTo(92.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(12.0f)
                lineTo(104.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 128.0f)
                close()
                moveTo(224.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                lineTo(28.0f, 204.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 0.0f, 176.0f)
                lineTo(0.0f, 80.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 28.0f, 52.0f)
                lineTo(196.0f, 52.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 224.0f, 80.0f)
                close()
                moveTo(200.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(28.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(196.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
                moveTo(244.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(256.0f, 104.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 244.0f, 92.0f)
                close()
            }
        }
        .build()
        return _batteryplus!!
    }

private var _batteryplus: ImageVector? = null
