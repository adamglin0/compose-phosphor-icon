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

public val FillGroup.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) {
            return _textSubscript!!
        }
        _textSubscript = Builder(name = "TextSubscript", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                horizontalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(126.55f, 147.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.1f, 9.18f)
                lineTo(92.0f, 126.0f)
                lineTo(70.55f, 156.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.1f, -9.18f)
                lineTo(82.23f, 112.0f)
                lineTo(57.45f, 76.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.1f, -9.18f)
                lineTo(92.0f, 98.05f)
                lineToRelative(21.45f, -30.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.1f, 9.18f)
                lineTo(101.77f, 112.0f)
                close()
                moveTo(192.0f, 192.0f)
                horizontalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.4f, -12.8f)
                lineToRelative(36.0f, -48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -19.15f, -14.46f)
                arcToRelative(13.06f, 13.06f, 0.0f, false, false, -2.58f, 4.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.68f, -3.18f)
                arcToRelative(28.17f, 28.17f, 0.0f, true, true, 50.2f, 22.44f)
                lineTo(168.0f, 176.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
