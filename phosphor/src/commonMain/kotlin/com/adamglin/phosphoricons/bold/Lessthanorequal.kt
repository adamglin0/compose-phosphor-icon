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

public val BoldGroup.Lessthanorequal: ImageVector
    get() {
        if (_lessthanorequal != null) {
            return _lessthanorequal!!
        }
        _lessthanorequal = Builder(name = "Lessthanorequal", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(36.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.85f, -11.26f)
                lineToRelative(152.0f, -56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 8.3f, 22.52f)
                lineTo(82.71f, 104.0f)
                lineToRelative(121.44f, 44.74f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 172.0f)
                arcToRelative(11.85f, 11.85f, 0.0f, false, true, -4.15f, -0.74f)
                lineToRelative(-152.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 36.0f, 104.0f)
                close()
                moveTo(200.0f, 188.0f)
                lineTo(48.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(200.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _lessthanorequal!!
    }

private var _lessthanorequal: ImageVector? = null
