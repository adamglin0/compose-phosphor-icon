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

public val FillGroup.Spinner: ImageVector
    get() {
        if (_spinner != null) {
            return _spinner!!
        }
        _spinner = Builder(name = "Spinner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(161.94f, 82.75f)
                lineTo(178.94f, 65.75f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineToRelative(-17.0f, 17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, -11.31f)
                close()
                moveTo(48.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(72.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(94.06f, 173.25f)
                lineTo(77.06f, 190.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(17.0f, -17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, 11.31f)
                close()
                moveTo(94.06f, 94.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f)
                lineToRelative(-17.0f, -17.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 77.09f, 65.77f)
                lineToRelative(17.0f, 17.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 94.06f, 94.06f)
                close()
                moveTo(136.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(136.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(190.23f, 190.23f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-17.0f, -17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, -11.31f)
                lineToRelative(17.0f, 17.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 190.23f, 190.23f)
                close()
                moveTo(208.0f, 136.0f)
                lineTo(184.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _spinner!!
    }

private var _spinner: ImageVector? = null
