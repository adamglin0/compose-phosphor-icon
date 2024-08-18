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

public val FillGroup.`Air-traffic-control-fill`: ImageVector
    get() {
        if (`_air-traffic-control-fill` != null) {
            return `_air-traffic-control-fill`!!
        }
        `_air-traffic-control-fill` = Builder(name = "Air-traffic-control-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.11f, 70.82f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 64.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(32.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 25.0f, 85.47f)
                lineToRelative(26.19f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.0f, 10.53f)
                horizontalLineTo(189.82f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.0f, -10.53f)
                lineToRelative(26.19f, -72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 229.11f, 70.82f)
                close()
                moveTo(102.52f, 151.87f)
                arcToRelative(7.87f, 7.87f, 0.0f, false, true, -1.44f, 0.13f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.86f, -6.57f)
                lineTo(83.0f, 89.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.75f, -2.86f)
                lineToRelative(10.18f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 102.52f, 151.87f)
                close()
                moveTo(173.0f, 89.43f)
                lineToRelative(-10.19f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.86f, 6.57f)
                arcToRelative(7.87f, 7.87f, 0.0f, false, true, -1.44f, -0.13f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.44f, -9.3f)
                lineToRelative(10.18f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 173.0f, 89.43f)
                close()
                moveTo(160.0f, 188.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 160.0f, 188.0f)
                close()
            }
        }
        .build()
        return `_air-traffic-control-fill`!!
    }

private var `_air-traffic-control-fill`: ImageVector? = null
