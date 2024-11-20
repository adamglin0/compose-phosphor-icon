package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Exam: ImageVector
    get() {
        if (_exam != null) {
            return _exam!!
        }
        _exam = Builder(name = "Exam", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                lineTo(28.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.79f, 3.58f)
                lineTo(64.0f, 204.47f)
                lineToRelative(30.21f, 15.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 0.0f)
                lineTo(128.0f, 204.47f)
                lineToRelative(30.21f, 15.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 0.0f)
                lineTo(192.0f, 204.47f)
                lineToRelative(30.21f, 15.11f)
                arcTo(4.05f, 4.05f, 0.0f, false, false, 224.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(228.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(220.0f, 209.53f)
                lineTo(193.79f, 196.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 0.0f)
                lineTo(160.0f, 211.53f)
                lineToRelative(-30.21f, -15.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 0.0f)
                lineTo(96.0f, 211.53f)
                lineTo(65.79f, 196.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 0.0f)
                lineTo(36.0f, 209.53f)
                lineTo(36.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(99.58f, 94.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.16f, 0.0f)
                lineToRelative(-32.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.16f, 3.58f)
                lineTo(74.47f, 148.0f)
                horizontalLineToRelative(43.06f)
                lineToRelative(6.89f, 13.79f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 164.0f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, false, 1.79f, -0.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.79f, -5.37f)
                close()
                moveTo(78.47f, 140.0f)
                lineTo(96.0f, 104.94f)
                lineTo(113.53f, 140.0f)
                close()
                moveTo(196.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(172.0f, 132.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(164.0f, 132.0f)
                lineTo(144.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(20.0f)
                lineTo(164.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 196.0f, 128.0f)
                close()
            }
        }
        .build()
        return _exam!!
    }

private var _exam: ImageVector? = null
