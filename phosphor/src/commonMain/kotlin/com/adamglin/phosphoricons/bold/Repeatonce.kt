package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Repeatonce: ImageVector
    get() {
        if (_repeatonce != null) {
            return _repeatonce!!
        }
        _repeatonce = Builder(name = "Repeatonce", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 128.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 96.0f, 52.0f)
                horizontalLineToRelative(99.0f)
                lineToRelative(-3.52f, -3.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, -17.0f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(195.0f, 76.0f)
                lineTo(96.0f, 76.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, -52.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(224.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, -52.0f, 52.0f)
                lineTo(61.0f, 180.0f)
                lineToRelative(3.52f, -3.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, -17.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, -17.0f)
                lineTo(61.0f, 204.0f)
                horizontalLineToRelative(99.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, false, 76.0f, -76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 116.0f)
                close()
                moveTo(136.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(148.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.36f, -10.74f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.36f, 22.0f)
                lineTo(124.0f, 152.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 136.0f, 164.0f)
                close()
            }
        }
        .build()
        return _repeatonce!!
    }

private var _repeatonce: ImageVector? = null
