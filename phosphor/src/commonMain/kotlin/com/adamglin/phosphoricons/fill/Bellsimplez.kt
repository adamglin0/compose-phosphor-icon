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

public val FillGroup.BellSimpleZ: ImageVector
    get() {
        if (_bellSimpleZ != null) {
            return _bellSimpleZ!!
        }
        _bellSimpleZ = Builder(name = "BellSimpleZ", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 224.0f)
                close()
                moveTo(221.85f, 192.0f)
                arcTo(15.8f, 15.8f, 0.0f, false, true, 208.0f, 200.0f)
                lineTo(48.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.8f, -24.06f)
                curveTo(39.75f, 166.38f, 48.0f, 139.34f, 48.0f, 104.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 160.0f, 0.0f)
                curveToRelative(0.0f, 35.33f, 8.26f, 62.38f, 13.81f, 71.94f)
                arcTo(15.89f, 15.89f, 0.0f, false, true, 221.84f, 192.0f)
                close()
                moveTo(152.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(127.0f, 136.0f)
                lineToRelative(23.7f, -35.56f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 88.0f)
                lineTo(112.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(17.05f)
                lineToRelative(-23.7f, 35.56f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 152.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 144.0f)
                close()
            }
        }
        .build()
        return _bellSimpleZ!!
    }

private var _bellSimpleZ: ImageVector? = null
