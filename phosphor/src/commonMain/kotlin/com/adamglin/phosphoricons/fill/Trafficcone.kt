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

public val FillGroup.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) {
            return _trafficCone!!
        }
        _trafficCone = Builder(name = "TrafficCone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 208.0f)
                horizontalLineTo(213.69f)
                lineTo(153.42f, 34.75f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 138.31f, 24.0f)
                horizontalLineTo(117.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.11f, 10.74f)
                lineTo(42.31f, 208.0f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(95.43f, 104.0f)
                horizontalLineToRelative(65.14f)
                lineToRelative(16.7f, 48.0f)
                horizontalLineTo(78.73f)
                close()
            }
        }
        .build()
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
