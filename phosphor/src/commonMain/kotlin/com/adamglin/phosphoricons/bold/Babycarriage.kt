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

public val BoldGroup.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) {
            return _babyCarriage!!
        }
        _babyCarriage = Builder(name = "BabyCarriage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 28.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(52.0f)
                lineTo(58.16f, 100.0f)
                arcTo(40.07f, 40.07f, 0.0f, false, false, 20.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, false, 84.0f, 84.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 0.0f, -168.0f)
                close()
                moveTo(208.06f, 76.12f)
                arcTo(59.58f, 59.58f, 0.0f, false, true, 218.79f, 100.0f)
                lineTo(178.21f, 100.0f)
                close()
                moveTo(160.0f, 52.0f)
                arcToRelative(59.66f, 59.66f, 0.0f, false, true, 29.83f, 8.0f)
                lineTo(156.0f, 87.0f)
                lineTo(156.0f, 52.0f)
                close()
                moveTo(160.0f, 172.0f)
                lineTo(120.0f, 172.0f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, true, -58.79f, -48.0f)
                lineTo(218.79f, 124.0f)
                arcTo(60.1f, 60.1f, 0.0f, false, true, 160.0f, 172.0f)
                close()
                moveTo(108.0f, 224.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 108.0f, 224.0f)
                close()
                moveTo(212.0f, 224.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 212.0f, 224.0f)
                close()
            }
        }
        .build()
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
