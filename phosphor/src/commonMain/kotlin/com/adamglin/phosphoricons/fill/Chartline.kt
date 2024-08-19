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

public val FillGroup.Chartline: ImageVector
    get() {
        if (_chartline != null) {
            return _chartline!!
        }
        _chartline = Builder(name = "Chartline", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(200.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(62.92f)
                lineToRelative(34.88f, -29.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.56f, -0.51f)
                lineToRelative(43.0f, 28.69f)
                lineToRelative(43.41f, -36.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.24f, 12.3f)
                lineToRelative(-48.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.56f, 0.51f)
                lineToRelative(-43.0f, -28.69f)
                lineTo(64.0f, 155.75f)
                verticalLineTo(176.0f)
                close()
            }
        }
        .build()
        return _chartline!!
    }

private var _chartline: ImageVector? = null
