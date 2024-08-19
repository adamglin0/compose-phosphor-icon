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

public val BoldGroup.Handswipeleft: ImageVector
    get() {
        if (_handswipeleft != null) {
            return _handswipeleft!!
        }
        _handswipeleft = Builder(name = "Handswipeleft", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(201.0f, 68.0f)
                lineToRelative(11.51f, 11.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, 17.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 17.0f)
                lineTo(201.0f, 44.0f)
                horizontalLineToRelative(43.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 256.0f, 56.0f)
                close()
                moveTo(188.0f, 116.0f)
                arcToRelative(31.86f, 31.86f, 0.0f, false, false, -11.22f, 2.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 140.0f, 101.0f)
                lineTo(140.0f, 76.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                verticalLineToRelative(66.83f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 24.28f, 180.0f)
                lineToRelative(0.12f, 0.2f)
                lineToRelative(25.31f, 42.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 70.27f, 209.8f)
                lineTo(45.0f, 167.92f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 58.92f, 160.0f)
                lineToRelative(0.21f, 0.34f)
                lineToRelative(18.68f, 30.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 184.0f)
                lineTo(100.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(36.0f)
                curveToRelative(0.0f, 11.08f, -1.28f, 21.67f, -3.42f, 28.32f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 22.84f, 7.36f)
                curveToRelative(3.0f, -9.16f, 4.58f, -21.83f, 4.58f, -35.68f)
                lineTo(220.0f, 148.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 188.0f, 116.0f)
                close()
            }
        }
        .build()
        return _handswipeleft!!
    }

private var _handswipeleft: ImageVector? = null
