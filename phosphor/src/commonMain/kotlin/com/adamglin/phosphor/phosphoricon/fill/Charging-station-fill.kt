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

public val FillGroup.`Charging-station-fill`: ImageVector
    get() {
        if (`_charging-station-fill` != null) {
            return `_charging-station-fill`!!
        }
        `_charging-station-fill` = Builder(name = "Charging-station-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.0f, 69.66f)
                lineTo(221.66f, 50.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(229.66f, 81.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 86.63f)
                verticalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(128.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                horizontalLineTo(176.0f)
                verticalLineTo(56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                horizontalLineTo(72.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 48.0f, 56.0f)
                verticalLineTo(208.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(176.0f)
                verticalLineTo(120.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 48.0f, 0.0f)
                verticalLineTo(86.63f)
                arcTo(23.85f, 23.85f, 0.0f, false, false, 241.0f, 69.66f)
                close()
                moveTo(135.43f, 131.0f)
                lineToRelative(-16.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.57f, 165.0f)
                lineToRelative(11.61f, -29.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.43f, -11.0f)
                lineToRelative(16.0f, -40.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 119.43f, 91.0f)
                lineToRelative(-11.61f, 29.0f)
                horizontalLineTo(128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.43f, 11.0f)
                close()
            }
        }
        .build()
        return `_charging-station-fill`!!
    }

private var `_charging-station-fill`: ImageVector? = null
