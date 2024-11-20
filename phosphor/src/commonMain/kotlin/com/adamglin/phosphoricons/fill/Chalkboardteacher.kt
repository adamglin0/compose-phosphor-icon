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

public val FillGroup.ChalkboardTeacher: ImageVector
    get() {
        if (_chalkboardTeacher != null) {
            return _chalkboardTeacher!!
        }
        _chalkboardTeacher = Builder(name = "ChalkboardTeacher", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(53.39f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.23f, -4.57f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 86.76f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.23f, 4.57f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(104.0f, 168.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 104.0f, 168.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(159.43f, 200.0f)
                arcToRelative(63.93f, 63.93f, 0.0f, false, false, -13.16f, -16.0f)
                lineTo(192.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(200.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(64.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.0f, 7.75f)
                arcTo(63.72f, 63.72f, 0.0f, false, false, 48.57f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 56.0f)
                lineTo(216.0f, 56.0f)
                close()
            }
        }
        .build()
        return _chalkboardTeacher!!
    }

private var _chalkboardTeacher: ImageVector? = null
