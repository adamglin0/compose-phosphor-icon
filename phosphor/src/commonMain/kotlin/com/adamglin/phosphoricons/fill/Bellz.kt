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

public val FillGroup.BellZ: ImageVector
    get() {
        if (_bellZ != null) {
            return _bellZ!!
        }
        _bellZ = Builder(name = "BellZ", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.8f, 175.94f)
                curveTo(216.25f, 166.38f, 208.0f, 139.33f, 208.0f, 104.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -160.0f, 0.0f)
                curveToRelative(0.0f, 35.34f, -8.26f, 62.38f, -13.81f, 71.94f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 200.0f)
                lineTo(88.81f, 200.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 78.38f, 0.0f)
                lineTo(208.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.8f, -24.06f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -22.62f, -16.0f)
                horizontalLineToRelative(45.24f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(144.0f, 152.0f)
                lineTo(112.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.65f, -12.44f)
                lineTo(129.05f, 104.0f)
                lineTo(112.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.65f, 12.44f)
                lineTo(127.0f, 136.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _bellZ!!
    }

private var _bellZ: ImageVector? = null
