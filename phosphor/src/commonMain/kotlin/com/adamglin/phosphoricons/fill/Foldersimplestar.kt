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

public val FillGroup.Foldersimplestar: ImageVector
    get() {
        if (_foldersimplestar != null) {
            return _foldersimplestar!!
        }
        _foldersimplestar = Builder(name = "Foldersimplestar", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 48.0f)
                lineTo(93.33f, 48.0f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, true, 9.6f, 3.2f)
                lineTo(130.67f, 72.0f)
                lineTo(216.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(216.0f, 88.0f)
                lineTo(128.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.8f, -1.6f)
                lineTo(93.33f, 64.0f)
                lineTo(40.0f, 64.0f)
                lineTo(40.0f, 200.0f)
                horizontalLineToRelative(80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 208.0f)
                close()
                moveTo(239.63f, 159.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.0f, -5.56f)
                lineToRelative(-29.84f, -2.31f)
                lineToRelative(-11.43f, -26.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.7f, 0.0f)
                lineToRelative(-11.43f, 26.5f)
                lineToRelative(-29.84f, 2.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.47f, 14.14f)
                lineToRelative(22.51f, 18.59f)
                lineToRelative(-6.85f, 27.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.82f, 8.81f)
                lineTo(184.0f, 207.82f)
                lineToRelative(25.61f, 15.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.82f, -8.81f)
                lineToRelative(-6.85f, -27.71f)
                lineToRelative(22.51f, -18.59f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 239.63f, 159.2f)
                close()
            }
        }
        .build()
        return _foldersimplestar!!
    }

private var _foldersimplestar: ImageVector? = null
