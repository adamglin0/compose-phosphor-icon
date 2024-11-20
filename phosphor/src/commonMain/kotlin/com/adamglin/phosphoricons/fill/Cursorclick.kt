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

public val FillGroup.CursorClick: ImageVector
    get() {
        if (_cursorClick != null) {
            return _cursorClick!!
        }
        _cursorClick = Builder(name = "CursorClick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.49f, 190.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineTo(207.8f, 220.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-56.56f, -56.57f)
                lineTo(115.0f, 214.09f)
                curveToRelative(0.0f, 0.1f, -0.08f, 0.21f, -0.13f, 0.32f)
                arcToRelative(15.83f, 15.83f, 0.0f, false, true, -14.6f, 9.59f)
                lineToRelative(-0.79f, 0.0f)
                arcToRelative(15.83f, 15.83f, 0.0f, false, true, -14.41f, -11.0f)
                lineTo(32.8f, 52.92f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 52.92f, 32.8f)
                lineTo(213.0f, 85.07f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 1.41f, 29.8f)
                lineToRelative(-0.32f, 0.13f)
                lineToRelative(-50.17f, 19.27f)
                close()
                moveTo(96.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(104.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 32.0f)
                close()
                moveTo(16.0f, 104.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(16.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(124.42f, 39.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.74f, -3.58f)
                lineToRelative(8.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.31f, -7.16f)
                lineToRelative(-8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 124.42f, 39.16f)
                close()
                moveTo(28.42f, 120.85f)
                lineTo(12.42f, 128.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 14.31f)
                lineToRelative(16.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.16f, -14.31f)
                close()
            }
        }
        .build()
        return _cursorClick!!
    }

private var _cursorClick: ImageVector? = null
