package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Mountains: ImageVector
    get() {
        if (_mountains != null) {
            return _mountains!!
        }
        _mountains = Builder(name = "Mountains", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 80.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 164.0f, 80.0f)
                close()
                moveTo(164.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 40.0f)
                close()
                moveTo(254.88f, 195.92f)
                lineTo(200.32f, 103.84f)
                arcTo(15.87f, 15.87f, 0.0f, false, false, 186.55f, 96.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(15.85f, 15.85f, 0.0f, false, false, -13.76f, 7.84f)
                lineTo(146.63f, 148.0f)
                lineToRelative(-44.84f, -76.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.58f, 0.0f)
                lineTo(1.11f, 195.94f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 208.0f)
                lineTo(248.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.88f, -12.08f)
                close()
                moveTo(88.0f, 80.0f)
                lineToRelative(23.57f, 40.0f)
                lineTo(64.43f, 120.0f)
                close()
                moveTo(22.0f, 192.0f)
                lineToRelative(33.0f, -56.0f)
                horizontalLineToRelative(66.0f)
                lineToRelative(18.74f, 31.8f)
                lineToRelative(0.0f, 0.0f)
                lineTo(154.0f, 192.0f)
                close()
                moveTo(172.57f, 192.0f)
                lineTo(155.91f, 163.72f)
                lineTo(186.55f, 112.0f)
                lineTo(234.0f, 192.0f)
                close()
            }
        }
        .build()
        return _mountains!!
    }

private var _mountains: ImageVector? = null
