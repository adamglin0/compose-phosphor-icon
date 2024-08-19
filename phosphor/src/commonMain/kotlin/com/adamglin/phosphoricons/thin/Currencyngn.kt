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

public val ThinGroup.Currencyngn: ImageVector
    get() {
        if (_currencyngn != null) {
            return _currencyngn!!
        }
        _currencyngn = Builder(name = "Currencyngn", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 140.0f)
                lineTo(196.0f, 140.0f)
                lineTo(196.0f, 116.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(196.0f, 108.0f)
                lineTo(196.0f, 46.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(62.0f)
                lineTo(117.46f, 108.0f)
                lineTo(67.15f, 43.54f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 60.0f, 46.0f)
                verticalLineToRelative(62.0f)
                lineTo(40.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(60.0f, 116.0f)
                verticalLineToRelative(24.0f)
                lineTo(40.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(60.0f, 148.0f)
                verticalLineToRelative(62.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(68.0f, 148.0f)
                horizontalLineToRelative(70.54f)
                lineToRelative(50.31f, 64.46f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 192.0f, 214.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.3f, -0.22f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 196.0f, 210.0f)
                lineTo(196.0f, 148.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(188.0f, 116.0f)
                verticalLineToRelative(24.0f)
                lineTo(142.44f, 140.0f)
                lineToRelative(-18.73f, -24.0f)
                close()
                moveTo(68.0f, 57.63f)
                lineTo(107.32f, 108.0f)
                lineTo(68.0f, 108.0f)
                close()
                moveTo(68.0f, 140.0f)
                lineTo(68.0f, 116.0f)
                horizontalLineToRelative(45.56f)
                lineToRelative(18.73f, 24.0f)
                close()
                moveTo(188.0f, 198.37f)
                lineTo(148.68f, 148.0f)
                lineTo(188.0f, 148.0f)
                close()
            }
        }
        .build()
        return _currencyngn!!
    }

private var _currencyngn: ImageVector? = null
