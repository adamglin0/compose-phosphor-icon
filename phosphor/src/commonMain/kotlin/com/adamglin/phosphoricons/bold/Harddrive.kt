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

public val BoldGroup.HardDrive: ImageVector
    get() {
        if (_hardDrive != null) {
            return _hardDrive!!
        }
        _hardDrive = Builder(name = "HardDrive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 60.0f)
                lineTo(32.0f, 60.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(224.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(244.0f, 80.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 224.0f, 60.0f)
                close()
                moveTo(220.0f, 172.0f)
                lineTo(36.0f, 172.0f)
                lineTo(36.0f, 84.0f)
                lineTo(220.0f, 84.0f)
                close()
                moveTo(164.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 164.0f, 128.0f)
                close()
            }
        }
        .build()
        return _hardDrive!!
    }

private var _hardDrive: ImageVector? = null
