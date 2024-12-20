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

public val FillGroup.BellRinging: ImageVector
    get() {
        if (_bellRinging != null) {
            return _bellRinging!!
        }
        _bellRinging = Builder(name = "BellRinging", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 71.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.78f, -3.42f)
                arcToRelative(94.13f, 94.13f, 0.0f, false, false, -33.46f, -36.91f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.54f, -13.54f)
                arcToRelative(111.46f, 111.46f, 0.0f, false, true, 39.12f, 43.09f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 71.1f)
                close()
                moveTo(35.71f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.1f, -4.32f)
                arcTo(94.13f, 94.13f, 0.0f, false, true, 76.27f, 30.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.54f, -13.54f)
                arcTo(111.46f, 111.46f, 0.0f, false, false, 28.61f, 60.32f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 35.71f, 72.0f)
                close()
                moveTo(221.81f, 175.94f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 208.0f, 200.0f)
                lineTo(167.2f, 200.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -78.4f, 0.0f)
                lineTo(48.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.79f, -24.06f)
                curveTo(43.22f, 160.39f, 48.0f, 138.28f, 48.0f, 112.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 160.0f, 0.0f)
                curveTo(208.0f, 138.27f, 212.78f, 160.38f, 221.81f, 175.94f)
                close()
                moveTo(150.62f, 200.0f)
                lineTo(105.38f, 200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 45.24f, 0.0f)
                close()
            }
        }
        .build()
        return _bellRinging!!
    }

private var _bellRinging: ImageVector? = null
