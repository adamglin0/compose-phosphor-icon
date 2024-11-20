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

public val FillGroup.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) {
            return _trainRegional!!
        }
        _trainRegional = Builder(name = "TrainRegional", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 88.0f)
                close()
                moveTo(223.72f, 122.1f)
                lineTo(201.33f, 204.21f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 185.89f, 216.0f)
                lineTo(176.0f, 216.0f)
                lineToRelative(14.4f, 19.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.8f, 9.6f)
                lineTo(156.0f, 216.0f)
                lineTo(100.0f, 216.0f)
                lineTo(78.4f, 244.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.8f, -9.6f)
                lineTo(80.0f, 216.0f)
                lineTo(70.11f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.44f, -11.79f)
                lineTo(32.28f, 122.1f)
                arcToRelative(8.08f, 8.08f, 0.0f, false, true, 0.0f, -4.2f)
                lineTo(54.67f, 35.79f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 70.11f, 24.0f)
                lineTo(185.89f, 24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.44f, 11.79f)
                lineToRelative(22.39f, 82.11f)
                arcTo(8.08f, 8.08f, 0.0f, false, true, 223.72f, 122.1f)
                close()
                moveTo(136.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                close()
                moveTo(206.0f, 113.69f)
                lineTo(185.89f, 40.0f)
                lineTo(70.11f, 40.0f)
                lineTo(50.0f, 113.69f)
                lineToRelative(78.0f, 14.18f)
                close()
            }
        }
        .build()
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
