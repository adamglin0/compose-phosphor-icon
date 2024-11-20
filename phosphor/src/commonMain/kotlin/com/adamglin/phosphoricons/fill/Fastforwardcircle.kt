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

public val FillGroup.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) {
            return _fastForwardCircle!!
        }
        _fastForwardCircle = Builder(name = "FastForwardCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(196.8f, 134.4f)
                lineTo(148.8f, 170.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(136.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.2f, 6.4f)
                lineToRelative(-48.0f, 36.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(72.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, -6.4f)
                lineToRelative(48.0f, 36.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 128.0f)
                lineTo(136.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, -6.4f)
                lineToRelative(48.0f, 36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 12.8f)
                close()
            }
        }
        .build()
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
