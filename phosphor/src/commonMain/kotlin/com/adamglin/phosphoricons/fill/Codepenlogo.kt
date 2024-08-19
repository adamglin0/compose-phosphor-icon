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

public val FillGroup.Codepenlogo: ImageVector
    get() {
        if (_codepenlogo != null) {
            return _codepenlogo!!
        }
        _codepenlogo = Builder(name = "Codepenlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.79f, 89.0f)
                lineToRelative(-104.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.58f, 0.0f)
                lineToRelative(-104.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.21f, 7.0f)
                lineTo(114.1f, 217.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.9f, -3.52f)
                verticalLineToRelative(-57.3f)
                lineTo(66.55f, 128.0f)
                lineTo(32.0f, 146.61f)
                lineTo(32.0f, 109.39f)
                lineTo(66.55f, 128.0f)
                lineToRelative(16.88f, -9.09f)
                lineTo(40.87f, 96.0f)
                lineTo(120.0f, 53.39f)
                lineTo(120.0f, 99.22f)
                lineTo(83.43f, 118.91f)
                lineToRelative(44.57f, 24.0f)
                lineToRelative(44.57f, -24.0f)
                lineTo(189.45f, 128.0f)
                lineTo(224.0f, 109.39f)
                verticalLineToRelative(37.22f)
                lineTo(189.45f, 128.0f)
                lineTo(136.0f, 156.78f)
                verticalLineToRelative(57.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.9f, 3.52f)
                lineTo(235.79f, 167.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.21f, -7.0f)
                lineTo(240.0f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 235.79f, 89.0f)
                close()
                moveTo(172.57f, 119.0f)
                lineTo(136.0f, 99.22f)
                lineTo(136.0f, 53.39f)
                lineTo(215.13f, 96.0f)
                close()
            }
        }
        .build()
        return _codepenlogo!!
    }

private var _codepenlogo: ImageVector? = null
