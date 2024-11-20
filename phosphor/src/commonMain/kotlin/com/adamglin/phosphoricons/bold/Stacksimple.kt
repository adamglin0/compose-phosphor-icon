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

public val BoldGroup.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) {
            return _stackSimple!!
        }
        _stackSimple = Builder(name = "StackSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.05f, 110.42f)
                lineToRelative(112.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.9f, 0.0f)
                lineToRelative(112.0f, -64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -20.84f)
                lineToRelative(-112.0f, -64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.9f, 0.0f)
                lineToRelative(-112.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 20.84f)
                close()
                moveTo(128.05f, 49.82f)
                lineTo(215.81f, 100.0f)
                lineTo(128.0f, 150.18f)
                lineTo(40.19f, 100.0f)
                close()
                moveTo(250.47f, 142.05f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 246.0f, 158.42f)
                lineToRelative(-112.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.9f, 0.0f)
                lineToRelative(-112.0f, -64.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 22.0f, 137.58f)
                lineToRelative(106.0f, 60.6f)
                lineToRelative(106.0f, -60.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 250.42f, 142.05f)
                close()
            }
        }
        .build()
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
