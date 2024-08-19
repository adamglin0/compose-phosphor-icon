package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Person-simple-bike-bold`: ImageVector
    get() {
        if (`_person-simple-bike-bold` != null) {
            return `_person-simple-bike-bold`!!
        }
        `_person-simple-bike-bold` = Builder(name = "Person-simple-bike-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 84.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 168.0f, 84.0f)
                close()
                moveTo(168.0f, 44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 44.0f)
                close()
                moveTo(204.0f, 140.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 204.0f, 140.0f)
                close()
                moveTo(204.0f, 196.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 204.0f, 196.0f)
                close()
                moveTo(54.0f, 136.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 42.0f, 42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 54.0f, 136.0f)
                close()
                moveTo(54.0f, 196.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 54.0f, 196.0f)
                close()
                moveTo(188.0f, 128.0f)
                lineTo(152.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.49f, -3.51f)
                lineTo(120.0f, 101.0f)
                lineToRelative(-15.0f, 15.0f)
                lineToRelative(31.52f, 31.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 156.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 161.0f)
                lineTo(79.51f, 124.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineTo(157.0f, 104.0f)
                horizontalLineToRelative(31.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
            }
        }
        .build()
        return `_person-simple-bike-bold`!!
    }

private var `_person-simple-bike-bold`: ImageVector? = null
